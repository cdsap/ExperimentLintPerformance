package com.performance.module_0_106

class Feature106UseCase1(
    private val repository: Feature106Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
