package com.performance.module_4_286

class Feature286UseCase1(
    private val repository: Feature286Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
