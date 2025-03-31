package com.performance.module_4_286

class Feature286UseCase0(
    private val repository: Feature286Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
