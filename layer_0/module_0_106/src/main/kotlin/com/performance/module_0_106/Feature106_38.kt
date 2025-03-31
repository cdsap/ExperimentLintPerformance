package com.performance.module_0_106

class Feature106UseCase2(
    private val repository: Feature106Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
