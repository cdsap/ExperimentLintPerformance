package com.performance.module_4_286

class Feature286UseCase2(
    private val repository: Feature286Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
